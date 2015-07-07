#!/usr/local/bin/python

from deshaw.optvol.memcache import shared_memoize


@shared_memoize(k)
def test_memoize_function(param=None):
    print param
    return param+"a"

test_memoize_function("1")
test_memoize_function("2")
test_memoize_function("1")
