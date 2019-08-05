function New-ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${offloadingPeriodoffloaderPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties -ArgumentList @(
            ${offloadingPeriodoffloaderPeriodenabled}
        )
    }
}
