function New-ComAdobeCqProjectsImplServletProjectImageServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${imagePeriodquality},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${imagePeriodsupportedPeriodresolutions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqProjectsImplServletProjectImageServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqProjectsImplServletProjectImageServletProperties -ArgumentList @(
            ${imagePeriodquality},
            ${imagePeriodsupportedPeriodresolutions}
        )
    }
}
