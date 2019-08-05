function New-ComDayCqDamVideoImplServletVideoTestServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamVideoImplServletVideoTestServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamVideoImplServletVideoTestServletProperties -ArgumentList @(
            ${enabled}
        )
    }
}
