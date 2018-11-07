FROM java-base

WORKDIR $MYUSER_HOME
COPY build/distributions/HelloWorld.zip $MYUSER_HOME
RUN unzip HelloWorld.zip
COPY perf-to-flamegraph $MYUSER_HOME

CMD HelloWorld/bin/HelloWorld