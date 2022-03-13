package main

import "testing"

func TestSayHello(t *testing.T) {
	expected := "Hello, World!"
	actual := SayHello()

	if actual != expected {
		t.Fatalf("wanted %q, got %q", expected, actual)
	}

}
