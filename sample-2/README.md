# sample-2

A very simple Docker guide for this Spring Boot sample.

## Build

Use Docker to build the image from this directory:

```bash
docker build -t sample-2 .
```

## Run

Run the container and expose port 8080:

```bash
docker run --rm -it --name sample-2-spring -p 8080:8080 sample-2
```

Then open `http://localhost:8080` in your browser.
