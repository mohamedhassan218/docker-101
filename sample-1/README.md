# Sample 1: Alpine Shell Playground

This sample demonstrates a small container based on `alpine:latest` with a few useful tools installed.

## What this Dockerfile does

- Uses `alpine:latest` as the base image
- Installs basic utilities: `bash`, `curl`, `vim`, `nano`, `htop`, and `git`
- Sets the default working directory to `/app`
- Starts an interactive shell by default with `CMD ["/bin/sh"]`

## Build the image

From the `sample-1` directory, run:

```sh
docker build -t sample-1 .
```

## Run the container

Start a new container in interactive mode:

```sh
docker run --rm -it --name sample-1-shell sample-1
```

You will be dropped into a shell inside the container where you can explore the tools.

## Playground: use `docker exec`

Open a second terminal on the host and run a new command inside the running container:

```sh
docker exec -it sample-1-shell /bin/sh
```

Now you can run commands inside the container without stopping it.

### Example commands to try after `docker exec`

```sh
# Show current directory and list files
pwd
ls -la

# Check installed utilities
bash --version
curl --version
vim --version

git --version
```

## Install Node.js inside the container and run the REPL

This sample does not include Node.js by default, but you can install it manually inside the running container.

```sh
# Update package index and install nodejs and npm
apk update
apk add --no-cache nodejs npm

# Verify installation
node --version
npm --version
```

Once Node.js is installed, start the Node REPL:

```sh
node
```

In the Node prompt, print something simple:

```js
> console.log('Hello from Node inside Docker!')
Hello from Node inside Docker!
> 2 + 3
5
> .exit
```

## Notes

- The container is ephemeral when started with `--rm`, so any manual changes are lost after exit.
- Use `docker exec` to run commands inside a running container and experiment safely.
- If you want a permanent environment, add `nodejs` to the `Dockerfile` and rebuild the image.


