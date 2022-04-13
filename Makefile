%.class: %.java
	javac $<

trash = *.class *.un~

clean:
	$(RM) -r $(trash)

.PHONY: clean
