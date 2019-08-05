function New-ComDayCqSearchImplBuilderQueryBuilderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excerptPeriodproperties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodmaxPeriodentries},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodentryPeriodlifetime},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${xpathPeriodunion}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqSearchImplBuilderQueryBuilderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqSearchImplBuilderQueryBuilderImplProperties -ArgumentList @(
            ${excerptPeriodproperties},
            ${cachePeriodmaxPeriodentries},
            ${cachePeriodentryPeriodlifetime},
            ${xpathPeriodunion}
        )
    }
}
