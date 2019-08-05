function New-ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pathPrefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${createVersion}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties -ArgumentList @(
            ${servicePeriodranking},
            ${pathPrefix},
            ${createVersion}
        )
    }
}
