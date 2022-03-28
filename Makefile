hello:
	echo "hello world"
	${package}
	echo "End of hello"

define package
	echo "Define called"
endef
