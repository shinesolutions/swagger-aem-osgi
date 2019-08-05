using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo:  IEquatable<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo()
        {
        }

        private ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo left, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo left, ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties _Properties;

            internal ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoBuilder Properties(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo</returns>
            public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}