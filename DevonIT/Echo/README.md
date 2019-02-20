# README #

This is how to get you started like a pro!

## Prerequisites ##

[sphinx](http://mkdocs.readthedocs.org/en/0.10)

### Linux: ###

```
$ virtualenv2 sphinx_root
$ source sphinx_root/bin/activate
$ pip install -U Shinx sphinx_rtd_theme
$ cd echo-administration-guide
$ make html
```
* The generated html is in ``build\html``

### Windows: ###

* Install portable python from http://sourceforge.net/projects/winpython/files/WinPython_2.7/
* Open the ``WinPython Command Prompt`` and run ``pip install -U Sphinx sphinx_rtd_theme``
* Open a ``WinPython Command Prompt`` in your checkout and run ``make html``
* The generated html is in ``build\html``

### Document Style ###
* Use 4 space indents instead of tabs.  Easiest way is to configure your text editor to expand tabs to 4 spaces.  reStructuredText is touchy when it comes to indentation.
* Use PNG or SVG graphics as much as possible to make the output scale to the destination format the best.
* To keep changes as explicit as possible for translators and for review please put your editor to use hard line returns at 80 cols.