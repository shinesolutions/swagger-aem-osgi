using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo:  IEquatable<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo>
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
        public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo left, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo left, ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoBuilder Properties(ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo</returns>
            public ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo(
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