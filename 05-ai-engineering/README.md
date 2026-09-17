# AI & LLM Engineering

> Large Language Model applications, RAG architectures, agentic workflows, and evaluation systems.

---

## 1. Overview

This directory documents practical AI engineering with Large Language Models (LLMs), moving beyond basic API calls into production-grade architectures: Retrieval-Augmented Generation (RAG), multi-agent orchestration, structured outputs, prompt engineering, and systematic evaluation.

---

## 2. Topics Covered

- **Prompt Engineering & Structured Outputs**: Few-shot prompting, chain-of-thought, JSON schema enforcement, and tool calling
- **Embeddings & Vector Databases**: Text embeddings, vector similarity search, indexing techniques, and vector stores (Chroma, Qdrant, Pinecone, pgvector)
- **Retrieval-Augmented Generation (RAG)**:
  - Document chunking, hybrid search (dense + sparse / BM25)
  - Re-ranking, query transformation, and contextual compression
  - GraphRAG and advanced retrieval strategies
- **Agentic Architectures**: ReAct frameworks, multi-agent systems, tool execution, state machines (LangGraph, AutoGen, CrewAI)
- **Evaluation & Observability**: Ragas, TruLens, LLM-as-a-judge, latency/cost tracking, tracing (Langfuse, Arize Phoenix)
- **Local Models & Inference**: Ollama, vLLM, quantized models (GGUF), and fine-tuning basics (LoRA/QLoRA)

---

## 3. Directory Structure

```text
05-ai-engineering/
├── README.md
├── 01-prompt-engineering/ # Structured prompt templates and output parsers
├── 02-rag-pipelines/      # Document ingestion, indexing, and retrieval implementations
├── 03-agents/             # Autonomous tool-using agents and orchestration patterns
└── 04-evaluations/        # Benchmark datasets, metric definitions, and eval runners
```

---

## 4. Engineering Standards

- Treat prompt templates and configurations as version-controlled code.
- Implement comprehensive unit and integration tests for AI pipelines.
- Ensure all retrieval and agent steps are instrumented for observability.
- Strictly safeguard API keys and model credentials using environment variables.
