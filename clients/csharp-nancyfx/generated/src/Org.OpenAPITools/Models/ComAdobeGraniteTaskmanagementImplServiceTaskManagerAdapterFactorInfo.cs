using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo:  IEquatable<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo>
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
        public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo()
        {
        }

        private ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo(string Pid, string Title, string Description, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo left, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo left, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties _Properties;

            internal ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoBuilder Properties(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo</returns>
            public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo(
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