using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDtmImplServletsDTMDeployHookServletInfo
    /// </summary>
    public sealed class ComAdobeCqDtmImplServletsDTMDeployHookServletInfo:  IEquatable<ComAdobeCqDtmImplServletsDTMDeployHookServletInfo>
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
        public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDtmImplServletsDTMDeployHookServletInfo()
        {
        }

        private ComAdobeCqDtmImplServletsDTMDeployHookServletInfo(string Pid, string Title, string Description, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder</returns>
        public static ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder Builder()
        {
            return new ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder</returns>
        public ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqDtmImplServletsDTMDeployHookServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo left, ComAdobeCqDtmImplServletsDTMDeployHookServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDtmImplServletsDTMDeployHookServletInfo left, ComAdobeCqDtmImplServletsDTMDeployHookServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.
        /// </summary>
        public sealed class ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDtmImplServletsDTMDeployHookServletProperties _Properties;

            internal ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletInfoBuilder Properties(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqDtmImplServletsDTMDeployHookServletInfo</returns>
            public ComAdobeCqDtmImplServletsDTMDeployHookServletInfo Build()
            {
                Validate();
                return new ComAdobeCqDtmImplServletsDTMDeployHookServletInfo(
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