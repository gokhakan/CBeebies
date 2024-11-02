#!/bin/bash
export BROWSER=chrome

mvn test -Dcucumber.options="--tags @regression"
