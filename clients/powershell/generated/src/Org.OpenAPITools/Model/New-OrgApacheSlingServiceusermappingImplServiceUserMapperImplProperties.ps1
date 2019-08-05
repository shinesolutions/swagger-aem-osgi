function New-OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${userPeriodmapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${userPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${userPeriodenablePerioddefaultPeriodmapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${requirePeriodvalidation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties -ArgumentList @(
            ${userPeriodmapping},
            ${userPerioddefault},
            ${userPeriodenablePerioddefaultPeriodmapping},
            ${requirePeriodvalidation}
        )
    }
}
