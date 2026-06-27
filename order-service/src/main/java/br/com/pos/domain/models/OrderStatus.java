package br.com.pos.domain.models;

/**
 * Estados possíveis de um pedido no ciclo de vida do domínio.
 * Mantido no núcleo (domínio) por ser uma regra de negócio pura,
 * independente de framework ou infraestrutura.
 */
public enum OrderStatus {
    CREATED,
    CONFIRMED,
    CANCELLED
}
