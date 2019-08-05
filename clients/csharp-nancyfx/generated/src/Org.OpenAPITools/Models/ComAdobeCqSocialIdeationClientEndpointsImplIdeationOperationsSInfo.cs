using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo
    /// </summary>
    public sealed class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo:  IEquatable<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo>
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
        public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo()
        {
        }

        private ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo(string Pid, string Title, string Description, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder</returns>
        public static ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder Builder()
        {
            return new ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder</returns>
        public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo left, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo left, ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties _Properties;

            internal ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoBuilder Properties(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo</returns>
            public ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo(
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