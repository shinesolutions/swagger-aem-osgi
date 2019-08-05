function New-ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authoringUIModeServicePerioddefault}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties -ArgumentList @(
            ${authoringUIModeServicePerioddefault}
        )
    }
}
