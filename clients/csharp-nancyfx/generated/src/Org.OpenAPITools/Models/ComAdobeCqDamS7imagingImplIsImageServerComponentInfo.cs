using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamS7imagingImplIsImageServerComponentInfo
    /// </summary>
    public sealed class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo:  IEquatable<ComAdobeCqDamS7imagingImplIsImageServerComponentInfo>
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
        public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo()
        {
        }

        private ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(string Pid, string Title, string Description, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder</returns>
        public static ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder Builder()
        {
            return new ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder</returns>
        public ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamS7imagingImplIsImageServerComponentInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo left, ComAdobeCqDamS7imagingImplIsImageServerComponentInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo left, ComAdobeCqDamS7imagingImplIsImageServerComponentInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.
        /// </summary>
        public sealed class ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamS7imagingImplIsImageServerComponentProperties _Properties;

            internal ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentInfoBuilder Properties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</returns>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo Build()
            {
                Validate();
                return new ComAdobeCqDamS7imagingImplIsImageServerComponentInfo(
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