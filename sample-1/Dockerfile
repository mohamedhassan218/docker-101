# Lightweight Linux distribution
FROM alpine:latest

# Install basic useful tools
RUN apk update && apk add --no-cache \
    bash \
    curl \
    vim \
    nano \
    htop \
    git

# Default working directory
WORKDIR /app

# Simple startup command
CMD ["/bin/sh"]