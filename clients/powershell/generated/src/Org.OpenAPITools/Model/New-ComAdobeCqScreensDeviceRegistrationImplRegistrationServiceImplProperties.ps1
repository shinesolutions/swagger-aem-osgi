function New-ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${deviceRegistrationTimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties -ArgumentList @(
            ${deviceRegistrationTimeout}
        )
    }
}
