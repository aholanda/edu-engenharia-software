GITHUB_LNK = https://raw.githubusercontent.com/ajholanda/edu-softeng/master/
TEXES := $(wildcard *.tex)

OOP_GENERICS_SRCS =  ListaEncadeadaGen.java ListaEncadeadaGenExec.java \
			ListaEncadeadaGenNoComp.java ListaEncadeadaObj.java \
			ListaEncadeadaObjExec.java ListaEncadeadaObjNoExec.java \
			SubtipoCuringa.java SubtipoCuringaExec.java \
			SubtipoCuringaNo.java SubtipoCuringaNoComp.java

main.pdf: $(TEXES) main.bbl
	xelatex main.tex

main.bbl: main.aux
	bibtex $<

main.aux: main.tex
	xelatex main.tex

trash += main.pdf

requisitos.tex: state.png usecase.png

usecase.png: img/usecase.dia
	dia -e $@ -t png $<

trash += usecase.png

state.png: img/state.dia
	dia -e $@ -t png $<

trash += state.png

spice.tex: spice-assess.png

spice-assess.png: img/spice-assess.dot
	dot -Tpng $< -o $@
trash += spice-assess.png

generics.tex:$(OOP_GENERICS_SRCS)

$(OOP_GENERICS_SRCS):
	$(foreach src,$(OOP_GENERICS_SRCS),wget $(GITHUB_LNK)/oop/$(src);)
trash += $(OOP_GENERICS_SRCS)

TDD.tex: Calculadora.java TesteCalculadora.java

Calculadora.java:
	wget $(GITHUB_LNK)/TDD/Calculadora.java
trash += Calculadora.java

TesteCalculadora.java:
	wget $(GITHUB_LNK)/TDD/TesteCalculadora.java
trash += TesteCalculadora.java:

trash += *.aux *.bbl *.blg *.dvi *.idx  *.log *.nav *.out main.pdf *.scn *.snm *.toc *.vrb

clean:
	$(RM) $(trash)


