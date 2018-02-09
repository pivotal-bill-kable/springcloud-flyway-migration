package io.pivotal.pal.flyway.strategies;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("'${migrate.command}'.equals('repair')")
public class RepairMigrationStrategy implements FlywayMigrationStrategy {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void migrate(Flyway flyway) {
        flyway.repair();
        logger.info("Repair completed");
    }
}