function New-ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodpagesupdatehandlerPeriodimageresourcetypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties -ArgumentList @(
            ${cqPeriodpagesupdatehandlerPeriodimageresourcetypes}
        )
    }
}
