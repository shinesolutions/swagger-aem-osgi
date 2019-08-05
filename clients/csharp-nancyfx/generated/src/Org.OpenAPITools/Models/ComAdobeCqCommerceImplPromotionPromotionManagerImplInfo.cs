using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo
    /// </summary>
    public sealed class ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo:  IEquatable<ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo>
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
        public ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo()
        {
        }

        private ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo(string Pid, string Title, string Description, ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder</returns>
        public static ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder Builder()
        {
            return new ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder</returns>
        public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo left, ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo left, ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties _Properties;

            internal ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfoBuilder Properties(ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo</returns>
            public ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo(
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