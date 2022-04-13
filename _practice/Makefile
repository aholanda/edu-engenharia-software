# HTML BOOK
index.html: main.adoc intro.adoc vcs.adoc config.adoc
	asciidoctor $< -o $@
trash += index.html

clean:
	$(RM) $(trash)
