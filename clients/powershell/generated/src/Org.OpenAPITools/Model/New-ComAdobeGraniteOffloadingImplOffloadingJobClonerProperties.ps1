function New-ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${offloadingPeriodjobclonerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties -ArgumentList @(
            ${offloadingPeriodjobclonerPeriodenabled}
        )
    }
}
