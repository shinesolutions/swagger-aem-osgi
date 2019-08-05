function New-ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcommercePeriodcataloggeneratorPeriodbucketname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties -ArgumentList @(
            ${cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize},
            ${cqPeriodcommercePeriodcataloggeneratorPeriodbucketname},
            ${cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties}
        )
    }
}
