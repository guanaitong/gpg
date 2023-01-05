# gpg-demo

File desc:

1. `public.asc` is the public key
2. `hello.txt` is the plaintext file

Then ,we try to use `public.asc` to encrypt the `hello.txt` 

import public key

```shell
gpg --import public.asc
```

encrypt use public key

```shell
gpg -o hello.txt.asc --encrypt  --recipient B4917517FB521BF2 hello.txt
```

`B4917517FB521BF2` is the key id

You can not decrypt `hello.txt.asc`  unless you have the private key。And, `hello.txt.asc` will change every time as it contains the timestamp.

For Test : You can send us a encrypted file, and we check if it can decrypt by our private key.
