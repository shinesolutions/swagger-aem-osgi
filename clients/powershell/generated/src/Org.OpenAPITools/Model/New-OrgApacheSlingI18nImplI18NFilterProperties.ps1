function New-OrgApacheSlingI18nImplI18NFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodfilterPeriodscope}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingI18nImplI18NFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingI18nImplI18NFilterProperties -ArgumentList @(
            ${servicePeriodranking},
            ${slingPeriodfilterPeriodscope}
        )
    }
}
