# ciicgat-gpg

File desc:

1. `public.asc` is the public key
2. `hello.txt` is the plaintext file

Then, we try to use `public.asc` to encrypt the `hello.txt` .

import public key:

```shell
gpg --import public.asc
```

encrypt use the public key:

```shell
gpg -o hello.txt.asc --encrypt  --recipient BE1F3C466E873A89 hello.txt
```

`BE1F3C466E873A89` is the key id.

You can not decrypt `hello.txt.asc`  unless you have the private key, and  `hello.txt.asc` will change every time as it contains the timestamp.

For Test : You can send us an encrypted file, and we check that  it can be decrypted by our private key .



## Java application demo

you can run `com.ciicgat.Main` 

for mor information, see [gnupg - java pgp encrypt file with public key in asc file - Stack Overflow](https://stackoverflow.com/questions/63351345/java-pgp-encrypt-file-with-public-key-in-asc-file)

