function New-ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPerioddrmPeriodenable}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties -ArgumentList @(
            ${cqPerioddamPerioddrmPeriodenable}
        )
    }
}
