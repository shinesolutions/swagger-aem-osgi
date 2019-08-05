using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties:  IEquatable<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties>
    { 
        /// <summary>
        /// PayloadMoveWhiteList
        /// </summary>
        public ConfigNodePropertyArray PayloadMoveWhiteList { get; private set; }

        /// <summary>
        /// PayloadMoveHandleFromWorkflowProcess
        /// </summary>
        public ConfigNodePropertyBoolean PayloadMoveHandleFromWorkflowProcess { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties()
        {
        }

        private ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(ConfigNodePropertyArray PayloadMoveWhiteList, ConfigNodePropertyBoolean PayloadMoveHandleFromWorkflowProcess)
        {
            
            this.PayloadMoveWhiteList = PayloadMoveWhiteList;
            
            this.PayloadMoveHandleFromWorkflowProcess = PayloadMoveHandleFromWorkflowProcess;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder With()
        {
            return Builder()
                .PayloadMoveWhiteList(PayloadMoveWhiteList)
                .PayloadMoveHandleFromWorkflowProcess(PayloadMoveHandleFromWorkflowProcess);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties left, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties left, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder
        {
            private ConfigNodePropertyArray _PayloadMoveWhiteList;
            private ConfigNodePropertyBoolean _PayloadMoveHandleFromWorkflowProcess;

            internal ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.PayloadMoveWhiteList property.
            /// </summary>
            /// <param name="value">PayloadMoveWhiteList</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder PayloadMoveWhiteList(ConfigNodePropertyArray value)
            {
                _PayloadMoveWhiteList = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.PayloadMoveHandleFromWorkflowProcess property.
            /// </summary>
            /// <param name="value">PayloadMoveHandleFromWorkflowProcess</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesBuilder PayloadMoveHandleFromWorkflowProcess(ConfigNodePropertyBoolean value)
            {
                _PayloadMoveHandleFromWorkflowProcess = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties</returns>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(
                    PayloadMoveWhiteList: _PayloadMoveWhiteList,
                    PayloadMoveHandleFromWorkflowProcess: _PayloadMoveHandleFromWorkflowProcess
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}