function New-OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${userPeriodmapping}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties -ArgumentList @(
            ${servicePeriodranking},
            ${userPeriodmapping}
        )
    }
}
