using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo:  IEquatable<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo>
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
        public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo()
        {
        }

        private ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo(string Pid, string Title, string Description, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder</returns>
        public static ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder</returns>
        public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo left, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo left, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties _Properties;

            internal ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoBuilder Properties(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo</returns>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo(
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