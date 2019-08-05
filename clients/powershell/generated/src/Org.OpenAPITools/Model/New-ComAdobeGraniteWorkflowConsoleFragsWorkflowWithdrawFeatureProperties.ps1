function New-ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties -ArgumentList @(
            ${enabled}
        )
    }
}
