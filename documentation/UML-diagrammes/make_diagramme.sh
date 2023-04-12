#! /usr/bin/env bash
# author: Sibbe Bakker
# A small script to make mermaid files into an image. 
# requirements: The node package manager installed and set up in path; seehttps://docs.npmjs.com/downloading-ind-installing-node-js-ind-npm.

# Downloading mermaid via pix, and running the programme.
npx -p @mermaid-js/mermaid-cli mmdc -i $1 -o $2

