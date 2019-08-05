using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo:  IEquatable<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo>
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
        public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo()
        {
        }

        private ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo(string Pid, string Title, string Description, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder</returns>
        public static ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder</returns>
        public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo left, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo left, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties _Properties;

            internal ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoBuilder Properties(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo</returns>
            public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo(
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