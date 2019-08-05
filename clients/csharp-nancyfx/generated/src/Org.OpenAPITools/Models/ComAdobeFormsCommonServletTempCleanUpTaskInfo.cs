using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServletTempCleanUpTaskInfo
    /// </summary>
    public sealed class ComAdobeFormsCommonServletTempCleanUpTaskInfo:  IEquatable<ComAdobeFormsCommonServletTempCleanUpTaskInfo>
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
        public ComAdobeFormsCommonServletTempCleanUpTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServletTempCleanUpTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServletTempCleanUpTaskInfo()
        {
        }

        private ComAdobeFormsCommonServletTempCleanUpTaskInfo(string Pid, string Title, string Description, ComAdobeFormsCommonServletTempCleanUpTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServletTempCleanUpTaskInfo.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder</returns>
        public static ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder Builder()
        {
            return new ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder</returns>
        public ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder With()
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

        public bool Equals(ComAdobeFormsCommonServletTempCleanUpTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServletTempCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServletTempCleanUpTaskInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServletTempCleanUpTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServletTempCleanUpTaskInfo left, ComAdobeFormsCommonServletTempCleanUpTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServletTempCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServletTempCleanUpTaskInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServletTempCleanUpTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServletTempCleanUpTaskInfo left, ComAdobeFormsCommonServletTempCleanUpTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServletTempCleanUpTaskInfo.
        /// </summary>
        public sealed class ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeFormsCommonServletTempCleanUpTaskProperties _Properties;

            internal ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskInfoBuilder Properties(ComAdobeFormsCommonServletTempCleanUpTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServletTempCleanUpTaskInfo.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskInfo</returns>
            public ComAdobeFormsCommonServletTempCleanUpTaskInfo Build()
            {
                Validate();
                return new ComAdobeFormsCommonServletTempCleanUpTaskInfo(
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