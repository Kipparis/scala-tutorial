filename=consp

pdf: ${filename}.tex
	pdflatex  ${filename}
	biber     ${filename}
	makeindex ${filename}
	pdflatex  ${filename}
	pdflatex  ${filename} # second time is necessary to create links in document
	cp ${filename}.pdf fp_handbook.pdf
