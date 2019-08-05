using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo:  IEquatable<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo>
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
        public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo()
        {
        }

        private ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo(string Pid, string Title, string Description, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo left, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo left, ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties _Properties;

            internal ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoBuilder Properties(ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo</returns>
            public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo(
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