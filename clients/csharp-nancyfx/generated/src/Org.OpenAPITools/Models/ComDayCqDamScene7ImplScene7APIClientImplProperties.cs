using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7APIClientImplProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7APIClientImplProperties:  IEquatable<ComDayCqDamScene7ImplScene7APIClientImplProperties>
    { 
        /// <summary>
        /// CqDamScene7ApiclientRecordsperpageNofilterName
        /// </summary>
        public ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageNofilterName { get; private set; }

        /// <summary>
        /// CqDamScene7ApiclientRecordsperpageWithfilterName
        /// </summary>
        public ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageWithfilterName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7APIClientImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7APIClientImplProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7APIClientImplProperties(ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageNofilterName, ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageWithfilterName)
        {
            
            this.CqDamScene7ApiclientRecordsperpageNofilterName = CqDamScene7ApiclientRecordsperpageNofilterName;
            
            this.CqDamScene7ApiclientRecordsperpageWithfilterName = CqDamScene7ApiclientRecordsperpageWithfilterName;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7APIClientImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamScene7ApiclientRecordsperpageNofilterName(CqDamScene7ApiclientRecordsperpageNofilterName)
                .CqDamScene7ApiclientRecordsperpageWithfilterName(CqDamScene7ApiclientRecordsperpageWithfilterName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7APIClientImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7APIClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7APIClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7APIClientImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7APIClientImplProperties left, ComDayCqDamScene7ImplScene7APIClientImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7APIClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7APIClientImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7APIClientImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7APIClientImplProperties left, ComDayCqDamScene7ImplScene7APIClientImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7APIClientImplProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamScene7ApiclientRecordsperpageNofilterName;
            private ConfigNodePropertyInteger _CqDamScene7ApiclientRecordsperpageWithfilterName;

            internal ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplProperties.CqDamScene7ApiclientRecordsperpageNofilterName property.
            /// </summary>
            /// <param name="value">CqDamScene7ApiclientRecordsperpageNofilterName</param>
            public ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder CqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger value)
            {
                _CqDamScene7ApiclientRecordsperpageNofilterName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7APIClientImplProperties.CqDamScene7ApiclientRecordsperpageWithfilterName property.
            /// </summary>
            /// <param name="value">CqDamScene7ApiclientRecordsperpageWithfilterName</param>
            public ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder CqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger value)
            {
                _CqDamScene7ApiclientRecordsperpageWithfilterName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7APIClientImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7APIClientImplProperties</returns>
            public ComDayCqDamScene7ImplScene7APIClientImplProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7APIClientImplProperties(
                    CqDamScene7ApiclientRecordsperpageNofilterName: _CqDamScene7ApiclientRecordsperpageNofilterName,
                    CqDamScene7ApiclientRecordsperpageWithfilterName: _CqDamScene7ApiclientRecordsperpageWithfilterName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}