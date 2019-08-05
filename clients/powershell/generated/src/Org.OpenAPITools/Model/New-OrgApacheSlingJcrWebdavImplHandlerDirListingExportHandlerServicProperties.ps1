function New-OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties -ArgumentList @(
            ${servicePeriodranking}
        )
    }
}
