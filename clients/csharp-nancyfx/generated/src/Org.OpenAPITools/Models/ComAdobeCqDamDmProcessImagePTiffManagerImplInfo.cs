using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamDmProcessImagePTiffManagerImplInfo
    /// </summary>
    public sealed class ComAdobeCqDamDmProcessImagePTiffManagerImplInfo:  IEquatable<ComAdobeCqDamDmProcessImagePTiffManagerImplInfo>
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
        public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamDmProcessImagePTiffManagerImplInfo()
        {
        }

        private ComAdobeCqDamDmProcessImagePTiffManagerImplInfo(string Pid, string Title, string Description, ComAdobeCqDamDmProcessImagePTiffManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder</returns>
        public static ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder Builder()
        {
            return new ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder</returns>
        public ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamDmProcessImagePTiffManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo left, ComAdobeCqDamDmProcessImagePTiffManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamDmProcessImagePTiffManagerImplInfo left, ComAdobeCqDamDmProcessImagePTiffManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamDmProcessImagePTiffManagerImplProperties _Properties;

            internal ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplInfoBuilder Properties(ComAdobeCqDamDmProcessImagePTiffManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplInfo</returns>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDamDmProcessImagePTiffManagerImplInfo(
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