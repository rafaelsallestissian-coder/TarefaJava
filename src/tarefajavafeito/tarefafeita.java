#include <stdio.h>
#include <string.h>
#include <ctype.h>

int senhaValida(char senha[]) {
    int temMaiuscula = 0;
    int temMinuscula = 0;
    int temNumero = 0;

    if (strlen(senha) < 8) return 0;

    for (int i = 0; senha[i] != '\0'; i++) {
        if (isupper(senha[i])) temMaiuscula = 1;
        if (islower(senha[i])) temMinuscula = 1;
        if (isdigit(senha[i])) temNumero = 1;
    }

    return temMaiuscula && temMinuscula && temNumero;
}

int main() {
    char senha[100];

    printf("Digite a senha: ");
    scanf("%s", senha);

    if (senhaValida(senha))
        printf("Senha valida!\n");
    else
        printf("Senha invalida!\n");

    return 0;
}