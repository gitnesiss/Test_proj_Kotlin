# Makefile для Kotlin
COMPILER=kotlinc
NAME_FILE=app.kt
GOAl_FILE=app.jar
PARAMETERS=-include-runtime

# -include-runtime - параметр указывает, что создаваемый файл будет включать
#     среду Kotlin.
# -d - параметр указывает, как будет называться создаваесый файл приложения.

all:
	$(COMPILER) $(NAME_FILE) $(PARAMETERS) -d $(GOAl_FILE)

