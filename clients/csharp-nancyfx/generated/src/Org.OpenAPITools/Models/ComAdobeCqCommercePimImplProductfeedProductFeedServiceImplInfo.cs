using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo:  IEquatable<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo>
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
        public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo()
        {
        }

        private ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder</returns>
        public static ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder</returns>
        public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo left, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo left, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties _Properties;

            internal ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoBuilder Properties(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo</returns>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo(
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