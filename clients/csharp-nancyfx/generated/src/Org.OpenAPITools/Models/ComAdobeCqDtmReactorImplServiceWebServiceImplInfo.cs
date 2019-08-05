using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDtmReactorImplServiceWebServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqDtmReactorImplServiceWebServiceImplInfo:  IEquatable<ComAdobeCqDtmReactorImplServiceWebServiceImplInfo>
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
        public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDtmReactorImplServiceWebServiceImplInfo()
        {
        }

        private ComAdobeCqDtmReactorImplServiceWebServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqDtmReactorImplServiceWebServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder</returns>
        public static ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder</returns>
        public ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDtmReactorImplServiceWebServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo left, ComAdobeCqDtmReactorImplServiceWebServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDtmReactorImplServiceWebServiceImplInfo left, ComAdobeCqDtmReactorImplServiceWebServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDtmReactorImplServiceWebServiceImplProperties _Properties;

            internal ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplInfoBuilder Properties(ComAdobeCqDtmReactorImplServiceWebServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDtmReactorImplServiceWebServiceImplInfo</returns>
            public ComAdobeCqDtmReactorImplServiceWebServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDtmReactorImplServiceWebServiceImplInfo(
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