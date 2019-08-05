function New-ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${wcmcommandservletPerioddeleteUnderscorewhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplCommandsWCMCommandServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplCommandsWCMCommandServletProperties -ArgumentList @(
            ${wcmcommandservletPerioddeleteUnderscorewhitelist}
        )
    }
}
