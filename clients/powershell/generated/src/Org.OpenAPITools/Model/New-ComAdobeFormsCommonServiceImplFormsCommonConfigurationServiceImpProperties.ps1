function New-ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${tempStorageConfig}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties -ArgumentList @(
            ${tempStorageConfig}
        )
    }
}
