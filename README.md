# gpg-demo

File desc:

1. `public.asc` is the public key
2. `hello.txt` is the original file
3. `hello.txt.asc` is the encrypted data

Then ,we try to use `public.asc` to decrypt the `hello.txt.asc` 

import public key

```shell
gpg --import public.asc
```

Decrypt use public key

```shell
gpg -o decrypted-hello.txt --decrypt  --recipient B4917517FB521BF2 hello.txt.asc
```

check

```shell
diff hello.txt decrypted-hello.txt
```

