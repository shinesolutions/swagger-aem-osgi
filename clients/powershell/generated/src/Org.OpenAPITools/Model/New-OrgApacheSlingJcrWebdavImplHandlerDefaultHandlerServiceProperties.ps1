function New-OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${typePeriodcollections},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${typePeriodnoncollections},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${typePeriodcontent}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties -ArgumentList @(
            ${servicePeriodranking},
            ${typePeriodcollections},
            ${typePeriodnoncollections},
            ${typePeriodcontent}
        )
    }
}
